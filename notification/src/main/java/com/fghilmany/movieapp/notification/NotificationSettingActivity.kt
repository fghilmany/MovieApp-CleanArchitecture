package com.fghilmany.movieapp.notification

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import org.koin.core.context.loadKoinModules

class NotificationSettingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification_setting)

        loadKoinModules(notificationModule)

        initToolbar()

        supportFragmentManager.beginTransaction()
            .add(R.id.setting_container, NotificationFragment()).commit()
    }

    private fun initToolbar() {
        val settingToolbar = findViewById<Toolbar>(R.id.setting_toolbar)
        settingToolbar.title = "Notification"
        setSupportActionBar(settingToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        settingToolbar.setNavigationOnClickListener {
            finish()
        }
    }
}