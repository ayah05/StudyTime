# StudyTime

StudyTime is an Android educational app for young learners. It provides interactive activities for learning mathematics, reading digital and analog clocks, and recognizing animals.

## Features

- Introductory learning flow for young users
- 36 progressive mathematics tasks
- Digital clock lessons and quizzes
- Analog clock lessons and quizzes
- Animal-learning activities with multiple practice modes
- Child-friendly Android interface

## Technology

- **Language:** Java
- **Platform:** Android
- **Build system:** Gradle
- **Compile SDK:** Android SDK 30
- **Minimum SDK:** Android API 16
- **Libraries:** AndroidX AppCompat, Google Material Components, ConstraintLayout, JUnit, and Espresso

## Project structure

```text
app/
  src/main/java/com/example/myapplication/
    IntroductoryActivity.java     App introduction and launch flow
    MainActivity.java              Main navigation activity
    AnalogActivity*.java           Analog clock lessons
    AnalogQuiz*.java               Analog clock quizzes
    DigitalActivity*.java          Digital clock lessons
    DigitalQuiz*.java              Digital clock quizzes
    mathsTask*.java                Progressive mathematics activities
    <animal>*.java                 Animal-learning activities
  src/main/res/                    Layouts, images, strings, and themes
  src/main/AndroidManifest.xml     Application and activity declarations
build.gradle                       Root Gradle configuration
app/build.gradle                   Android app configuration
```

## Getting started

### Prerequisites

- Android Studio with Android SDK 30 support
- Java 8 or later
- An Android emulator or Android device running API 16 or later

### Build and run

1. Clone the repository:

   ```bash
   git clone https://github.com/ayah05/StudyTime.git
   cd StudyTime
   ```

2. Open the project in Android Studio.
3. Allow Android Studio to sync the Gradle project.
4. Select an emulator or connected Android device.
5. Run the `app` configuration.

You can also build the debug APK from the command line:

```bash
./gradlew assembleDebug
```

On Windows, use `gradlew.bat assembleDebug`.

## Notes

The project currently uses the original Java package name `com.example.myapplication`, even though the application is branded **StudyTime**. Renaming the GitHub repository does not change the Android package name or application ID.

## Future improvements

- Replace generic activity names with descriptive names
- Consolidate repeated activity implementations
- Add automated tests for learning flows and quiz scoring
- Persist learner progress
- Update older Gradle and Android dependencies

## License

No license has been specified yet.
