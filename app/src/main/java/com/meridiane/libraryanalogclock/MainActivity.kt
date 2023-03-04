package com.meridiane.libraryanalogclock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hemantpatel.clock_library.AnalogClockView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // получить ссылку на AnalogClockview
    private  val mClockView : AnalogClockView
        get() = findViewById( R .id.clock_view)

    override fun onStart() {
        super.onStart()
        mClockView.startClock()
    }
    override fun onStop() {
        super.onStop()
        mClockView.stopClock()
    }
}