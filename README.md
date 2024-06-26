This project is a simple Android application built using Jetpack Compose. It includes a main screen with top and bottom navigation bars, and an edit profile screen.

Features

- **Main Screen**: Displays profile information with navigation options.
- **Edit Profile Screen**: Allows users to edit their profile details.
- **Navigation**: Uses Jetpack Navigation Compose to navigate between screens.

 Project Structure
MainActivity
The `MainActivity` class sets up the main content of the application using `ComposeApp2Theme` and the `Scafold` composable.

Composables
- **Scafold**: Sets up the overall layout including top and bottom bars, and navigation.
- **Arrange**: Displays the main content in a vertical list.
- **EditProfile**: Provides a text field for editing profile information.

Components
- **TopBarMain**: Defines the top bar of the application.
- **BottomBarMain**: Defines the bottom bar of the application.
- **MainContent**: Contains various UI components like profile image, buttons, and text fields.

Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/username/view-simple-screen.git
   ```
2. Open the project in Android Studio.
3. Build and run the project on an Android device or emulator.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.
