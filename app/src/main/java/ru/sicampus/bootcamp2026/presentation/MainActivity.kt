package ru.sicampus.bootcamp2026.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import ru.sicampus.bootcamp2026.presentation.screen.creating_meeting.CreatingMeetingScreen
import ru.sicampus.bootcamp2026.presentation.screen.registration.RegistrationScreen
import ru.sicampus.bootcamp2026.presentation.ui.theme.AndroidBootcamp2026FrontendTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidBootcamp2026FrontendTheme(
                darkTheme = false
            ) {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CreatingMeetingScreen { }(
                        modifier = Modifier.padding(innerPadding),
                        onNavigateToAuthorization = {},
                        onFinished = {}
                    )
                }
            }
        }
    }
}