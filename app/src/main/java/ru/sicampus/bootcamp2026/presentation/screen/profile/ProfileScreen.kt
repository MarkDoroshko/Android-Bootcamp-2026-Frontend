package ru.sicampus.bootcamp2026.presentation.screen.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit,
    onSignOutClick: () -> Unit
    // TODO(viewModel)
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                modifier = Modifier.padding(24.dp),
                title = {},
                navigationIcon = {
                    AppButton(
                        modifier = Modifier
                            .height(56.dp)
                            .width(56.dp),
                        contentPadding = PaddingValues(6.dp),
                        content = ButtonContent.Icon(
                            iconResId = R.drawable.ic_arrow_back,
                            size = 41.dp
                        ),
                        cornerRadius = 10.dp,
                        onClick = {}
                    )
                },
                actions = {
                    AppButton(
                        modifier = Modifier
                            .height(56.dp)
                            .width(115.dp),
                        contentPadding = PaddingValues(vertical = 16.dp),
                        content = ButtonContent.Text(
                            textResId = R.string.sign_out,
                            style = MaterialTheme.typography.labelMedium
                        ),
                        cornerRadius = 10.dp,
                        onClick = {}
                    )
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(MaterialTheme.colorScheme.surface)
                .padding(horizontal = 50.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Title(
                modifier = Modifier,
                titleText = stringResource(R.string.profile_title)
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
}

@Preview
@Composable
fun PreviewProfile() {
    AndroidBootcamp2026FrontendTheme {
        ProfileScreen(
            onBackClick = {},
            onSignOutClick = {}
        )
    }
}