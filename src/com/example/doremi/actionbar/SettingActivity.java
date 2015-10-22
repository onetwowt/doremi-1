package com.example.doremi.actionbar;

import com.example.doremi.R;
import com.example.doremi.R.id;
import com.example.doremi.R.layout;
import com.example.doremi.R.menu;

import android.app.Activity;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import android.view.Menu;
import android.view.MenuItem;

public class SettingActivity extends PreferenceActivity {
	
	private CheckBoxPreference soundPreference;         
	private PreferenceScreen servicePreference;     
	private PreferenceScreen cleanPreference;       
    private PreferenceScreen newVersionPreference;
    private PreferenceScreen aboutPreference;
   
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setting);
		
		soundPreference = (CheckBoxPreference) findPreference("CheckBox1");  
		servicePreference = (PreferenceScreen) findPreference("service");  
		cleanPreference = (PreferenceScreen) findPreference("clean");  
		newVersionPreference = (PreferenceScreen) findPreference("newVersion");  
		aboutPreference = (PreferenceScreen) findPreference("about");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.setting, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
