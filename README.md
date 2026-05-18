# The Secret Messenger App
![Android Studio](https://github.com/Angel43v3r/AD340-Assignments-TheSkylineMessenger/blob/master/Android_Studio_icon.png)
## Assignment 11 - The Secret Messenger App | Android
### AD340 - Mobile Application Development
### North Seattle College (Spring 2026)
### Date: May 17, 2026


## Table Of Contents
1. [Objective](#objective)
2. [How to Use](#how-to-use)
3. [Assignment Instruction](#assignment-instruction)
4. [Version Control](#version-control-github)
4. [Contributing](#contributing)
5. [License](#license)


## Objective
A native Android application where a user inputs a message on the first screen and views a "decoded" version of it on a second screen.


## How to Use
### Prerequisites
Make sure you have the following installed:
- **Visual Studio Code (VS Code)**
    - You can use any editor, VSC is recommended for this project. You can download from [VS Code official website](https://code.visualstudio.com/).

- **Android Studio**
    - **Android Studio** is required to run the app on an Android emulator or a physical device.
    - It provides the Android SDK, emulator, and build tools needed for React Native development.
    - You can download from the [Android Studio official website](https://developer.android.com/studio).

### Installation & Environment Setup
#### 1. Clone the Repository
   In the folder you want to save your project in, run:

```bash
git clone git@github.com:Angel43v3r/AD340-TheSecretMessengerApp.git
```

#### 2. Navigate to the app folder:

```
cd AD340-TheSecretMessengerApp
```

#### 3. Navigate to the folder
```
cd <Folder_Name>
```

#### 4. Now, let’s initialize a modern Android project template.


**STEP 1:** Open Android Studio and select `File` -> `New` -> `New Project`.

**STEP 2:** Choose `Empty Views Activity` (This is crucial!).

**STEP 3:** Configure the project:

```text
Name: TheSecretMessenger

Package name: com.example.thesecretmessenger

Minimum SDK: API 24 (Android 7.0) or higher.

Build configuration language: Kotlin DSL (build.gradle.kts).
```

**STEP 4:** Click Finish

- Wait for Gradle to finish "syncing" (this may take a few minutes on the first run).


## Assignment Instruction

### Phase 1: The Layouts
#### 1. Activity A (`MainActivity`):
- One `EditText` for the user to type a secret message.
- One `Button` labeled "Send Secret Message."

#### 2. Activity B (`MessageDisplayActivity`):
- One `TextView` to display the incoming string.
- One `Button` labeled "Back" (to return to the first screen).

### Phase 2: The Logic (The "Intent")
In your `MainActivity.java` or `MainActivity.kt`, implement an `OnClickListener` for your button that performs the following:
- **Capture:** Grab the string from the `EditText`.
- **Initialize:** Create an Explicit Intent targeting `MessageDisplayActivity`.
- **Pack:** Use `.putExtra(key, value)` to attach the string to the intent.
- **Launch:** Call `startActivity(intent)`.

### Phase 3: Receiving the Data
In `MessageDisplayActivity`, you need to "catch" what was thrown:

- **Retrieve:** Use `getIntent().getStringExtra(key)` (Java) or `intent.getStringExtra(key)` (Kotlin) inside `onCreate`.
- **Display:** Set the text of your `TextView` to this retrieved value.


## Version Control (GitHub)
### GitHub Initial Setup
1. Open Android Studio
2. Select `File` -> `Git` -> `Share Project On GitHub`

### To Commit:
Select `File` -> `Git` -> `GitHub` -> Commit

### To Push:
Select `File` -> `Git` -> `GitHub` -> Pull

### To Pull:
Select `File` -> `Git` -> `GitHub` -> Pull


## Contributing
Developed By: **Jovy Ann Nelson**

Instructor: **BC Ko**

Course: **AD340 - Mobile Application Development**

College: **North Seattle College**

Term: **Spring 2026**

Date: **May 10, 2026** to **May 17, 2026**


## License

This project is licensed under the MIT License. Please refer to the [LICENSE](https://github.com/Angel43v3r/AD340-TheSecretMessenger/blob/master/LICENSE) for more details.
