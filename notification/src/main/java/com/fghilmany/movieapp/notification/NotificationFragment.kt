package com.fghilmany.movieapp.notification

import android.content.SharedPreferences
import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.SwitchPreference
import org.koin.android.ext.android.inject

class NotificationFragment : PreferenceFragmentCompat(),
    SharedPreferences.OnSharedPreferenceChangeListener {

    private lateinit var reminder: String
    private lateinit var reminderPreference: SwitchPreference

    private val alarmReceiver: AlarmReceiver by inject()

    companion object {
        const val NOTIFICATION_ID = 1
        var CHANNEL_ID = "channel_01"
        var CHANNEL_NAME: CharSequence = "github channel"

    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.notification)
        init()
        setSummaries()

    }

    override fun onResume() {
        super.onResume()
        preferenceScreen.sharedPreferences.registerOnSharedPreferenceChangeListener(this)
    }

    override fun onPause() {
        super.onPause()
        preferenceScreen.sharedPreferences.unregisterOnSharedPreferenceChangeListener(this)
    }

    private fun init() {
        reminder = resources.getString(R.string.reminder_key)
        reminderPreference = findPreference<SwitchPreference>(reminder) as SwitchPreference

    }

    private fun setSummaries() {
        val sh = preferenceManager.sharedPreferences
        reminderPreference.isChecked = sh.getBoolean(reminder, false)


    }

    override fun onSharedPreferenceChanged(p0: SharedPreferences, p1: String?) {

        if (p1 == reminder) {
            reminderPreference.isChecked = p0.getBoolean(reminder, false)

            if (reminderPreference.isChecked) {
                val repeatTime = "09:00"
                val repeatMessage = "Cari teman belajarmu di Github"
                alarmReceiver.setRepeatingAlarm(
                    requireContext(),
                    AlarmReceiver.TYPE_REPEATING,
                    repeatTime,
                    repeatMessage
                )
            } else {
                alarmReceiver.cancelAlarm(requireContext())

            }
        }

    }
}