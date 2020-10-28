package io.surveylens.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import io.surveylens.SurveyLens

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 2. step: Initialize Survey Lens
        SurveyLens.initialize(this)

        findViewById<Button>(R.id.button_show_survey).setOnClickListener {
            // 3. step: Show a survey
            SurveyLens.launchSurvey(this, "SURVEY_ID")
        }
    }
}