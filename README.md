# [surveylens.io](https://surveylens.io) Android Demo

This demo project showcases the usage of the android library from Survey Lens. To use the library the first thing you need is a Survey Lens account, you can get one [here](https://surveylens.io/#register).

## Setup

To start, add the library to your [dependencies](https://github.com/surveylens/android-demo/blob/main/app/build.gradle#L37): `implementation "io.surveylens:surveylens:0.0.2"`

After registering your account you can obtain an API key that is necessary to use the library. Create a [surveylens.properties](https://github.com/surveylens/android-demo/blob/main/app/src/main/assets/surveylens.properties) file containing your API key the assets folder of your project.

Additionally the file can contain a `debug=true` line. If this is set to true, the library will print log statements to logcat.

The last setup step is to initialize the library inside your application. This step triggers the synchronization and ensures that the current surveys and answers are synchronized. To do this, add this line of code inside the onCreate method of your application or your first Activity, [like in the demo project](https://github.com/surveylens/android-demo/blob/main/app/src/main/java/io/surveylens/demo/MainActivity.kt#L14):

```kotlin
SurveyLens.initialize(this)
```

## Usage

To display a survey within your app, you can use the following code to display a survey. The survey is identified by the survey id, you can adapt that one in the web interface.

```kotlin
SurveyLens.launchSurvey(this, "SURVEY_ID")
```
