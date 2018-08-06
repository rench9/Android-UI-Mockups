package com.yahoo.r4hu7.basicregistration

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.heetch.countrypicker.CountryPickerCallbacks
import com.heetch.countrypicker.CountryPickerDialog
import kotlinx.android.synthetic.main.activity_registration.*


class RegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        val countryPicker = CountryPickerDialog(this, CountryPickerCallbacks
        { country, i ->
            etCountry.setText(country.isoCode)
        })
        etCountry.setOnFocusChangeListener { view, b ->
            if (b)
                countryPicker.show()
        }
        countryPicker.setCancelable(false)
    }
}
