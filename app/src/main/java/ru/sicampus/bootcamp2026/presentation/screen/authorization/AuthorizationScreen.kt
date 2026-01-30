package ru.sicampus.bootcamp2026.presentation.screen.authorization

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.sicampus.bootcamp2026.R
import ru.sicampus.bootcamp2026.presentation.components.AppButton
import ru.sicampus.bootcamp2026.presentation.components.ButtonContent
import ru.sicampus.bootcamp2026.presentation.components.Field
import ru.sicampus.bootcamp2026.presentation.components.Title
import ru.sicampus.bootcamp2026.presentation.ui.theme.AndroidBootcamp2026FrontendTheme

@Composable
fun AuthorizationScreen(
    modifier: Modifier = Modifier,
    onNavigateToAuthorization: () -> Unit,
    onFinished: () -> Unit
    // TODO(viewModel)
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surface)
            .padding(horizontal = 50.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Title(
            modifier = Modifier,
            titleText = stringResource(R.string.sign_in_title)
        )

        Spacer(modifier = Modifier.height(50.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Field(
                labelText = stringResource(R.string.email_placeholder)
            )
            Field(
                labelText = stringResource(R.string.password_placeholder)
            )
            AppButton(
                content = ButtonContent.Text(R.string.sign_in_button),
                onClick = {}
            )
            Text(
                text = stringResource(R.string.dont_have_account),
                fontWeight = FontWeight.W400,
                fontSize = 15.sp,
                color = MaterialTheme.colorScheme.primary
            )
        }
    }
}

@Preview
@Composable
fun PreviewAuthorizationScreen() {
    AndroidBootcamp2026FrontendTheme {
        AuthorizationScreen(
            onNavigateToAuthorization = {},
            onFinished = {}
        )
    }
}