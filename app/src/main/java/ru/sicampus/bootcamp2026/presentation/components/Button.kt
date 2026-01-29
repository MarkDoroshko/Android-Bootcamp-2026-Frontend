package ru.sicampus.bootcamp2026.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import ru.sicampus.bootcamp2026.presentation.ui.theme.AndroidBootcamp2026FrontendTheme

@Composable
fun Button(
    modifier: Modifier = Modifier,
    textOnButton: String,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary
        ),
        shape = RectangleShape,
        onClick = onClick,
        content = {
            Text(
                text = textOnButton
            )
        }
    )
}

@Preview
@Composable
fun PreviewButton() {
    AndroidBootcamp2026FrontendTheme {
        Button(
            textOnButton = "Зарегистрироваться",
            onClick = {}
        )
    }
}