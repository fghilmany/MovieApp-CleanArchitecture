package com.fghilmany.movieapp.notification;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u001c\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u001a\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/fghilmany/movieapp/notification/NotificationFragment;", "Landroidx/preference/PreferenceFragmentCompat;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "()V", "alarmReceiver", "Lcom/fghilmany/movieapp/notification/AlarmReceiver;", "getAlarmReceiver", "()Lcom/fghilmany/movieapp/notification/AlarmReceiver;", "alarmReceiver$delegate", "Lkotlin/Lazy;", "reminder", "", "reminderPreference", "Landroidx/preference/SwitchPreference;", "init", "", "onCreatePreferences", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "onPause", "onResume", "onSharedPreferenceChanged", "p0", "Landroid/content/SharedPreferences;", "p1", "setSummaries", "Companion", "notification_debug"})
public final class NotificationFragment extends androidx.preference.PreferenceFragmentCompat implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    private java.lang.String reminder;
    private androidx.preference.SwitchPreference reminderPreference;
    private final kotlin.Lazy alarmReceiver$delegate = null;
    public static final int NOTIFICATION_ID = 1;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String CHANNEL_ID;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.CharSequence CHANNEL_NAME;
    public static final com.fghilmany.movieapp.notification.NotificationFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.fghilmany.movieapp.notification.AlarmReceiver getAlarmReceiver() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreatePreferences(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState, @org.jetbrains.annotations.Nullable()
    java.lang.String rootKey) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    private final void init() {
    }
    
    private final void setSummaries() {
    }
    
    @java.lang.Override()
    public void onSharedPreferenceChanged(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1) {
    }
    
    public NotificationFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/fghilmany/movieapp/notification/NotificationFragment$Companion;", "", "()V", "CHANNEL_ID", "", "getCHANNEL_ID", "()Ljava/lang/String;", "setCHANNEL_ID", "(Ljava/lang/String;)V", "CHANNEL_NAME", "", "getCHANNEL_NAME", "()Ljava/lang/CharSequence;", "setCHANNEL_NAME", "(Ljava/lang/CharSequence;)V", "NOTIFICATION_ID", "", "notification_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCHANNEL_ID() {
            return null;
        }
        
        public final void setCHANNEL_ID(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.CharSequence getCHANNEL_NAME() {
            return null;
        }
        
        public final void setCHANNEL_NAME(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence p0) {
        }
        
        private Companion() {
            super();
        }
    }
}