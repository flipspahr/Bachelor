package com.flipspahr.smartcalender

import android.app.DatePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        pickDateBtn.setOnClickListener {
            val dpd = DatePickerDialog( this, DatePickerDialog.OnDateSetListener{view , mYear, mMonth, mDay ->
                dateTv.setText("" + mDay + "/" + (mMonth+1) + "/" + mYear)
            }, year, month, day)
            dpd.show()
        }
    }
}
