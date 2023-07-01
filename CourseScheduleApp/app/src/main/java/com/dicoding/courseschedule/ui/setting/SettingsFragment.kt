package com.dicoding.courseschedule.ui.setting

import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.preference.ListPreference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.SwitchPreference
import com.dicoding.courseschedule.R
import com.dicoding.courseschedule.notification.DailyReminder
import com.dicoding.courseschedule.util.NightMode
import java.util.*

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
        //TODO 10 : Update theme based on value in ListPreference

        val Theme = findPreference<ListPreference>(getString(R.string.pref_key_dark))
        Theme?.setOnPreferenceChangeListener { _, newValue ->
            val nightMode = NightMode.valueOf(newValue.toString().toUpperCase(Locale.getDefault())).value
            updateTheme(nightMode)
            true
        }
        //TODO 11 : Schedule and cancel notification in DailyReminder based on SwitchPreference
        val Notification = findPreference<SwitchPreference>(getString(R.string.pref_key_notify))
        Notification?.setOnPreferenceChangeListener { _, newValue ->
            if (newValue == true) { DailyReminder().setDailyReminder(requireContext()) }
            else { DailyReminder().cancelAlarm(requireContext()) }
            true
        }
    }
    private fun updateTheme(nightMode: Int): Boolean {
        AppCompatDelegate.setDefaultNightMode(nightMode)
        requireActivity().recreate()
        return true
    }
}