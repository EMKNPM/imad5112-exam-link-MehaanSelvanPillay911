[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/92arv5Vv)
Based on the code you provided, here is a professional `README.md` file for your Android project:

# IMAD Exam App

## Overview

The **IMAD Exam App** is an Android application developed in Kotlin. The application provides a simple interface that allows users to navigate between screens, enter gear-related information, and view stored data.

The project demonstrates:

* Activity navigation using Intents
* User input handling
* Button click events
* Basic error handling
* Android UI development with Kotlin

---

## Features

### Main Screen

* **Enter Button**

  * Navigates the user from the Main Screen to the Home Screen.
* **Exit Button**

  * Closes the application using `finishAffinity()`.

### Home Screen

* Allows users to enter gear information.
* Contains buttons for:

  * Adding gear data
  * Saving gear data
  * Displaying stored information
* Includes basic input validation and error handling.

### Detail View Screen

* Displays saved gear information.
* Shows results to the user.
* Includes a Return button to exit the application.

---

## Project Structure

```text
com.example.imadexam
│
├── MainActivity.kt
│   ├── Handles application entry point
│   ├── Navigates to HomeActivity
│   └── Exits the application
│
├── HomeActivity.kt
│   ├── Accepts gear input
│   ├── Handles user interactions
│   └── Validates entered data
│
├── DetailView.kt
│   ├── Displays saved gear information
│   └── Allows user to exit application
│
└── res/layout
    ├── activity_main.xml
    ├── activity_home.xml
    └── activity_detail_view.xml
```

---

## Technologies Used

* **Programming Language:** Kotlin
* **IDE:** Android Studio
* **Framework:** Android SDK
* **UI Components:**

  * TextView
  * EditText
  * Button
  * Toast Messages

---

## How the App Works

### Step 1: Launch Application

The user starts the app and is presented with the Main Screen.

### Step 2: Navigate to Home Screen

Pressing the **Enter** button opens the Home Screen.

### Step 3: Enter Gear Information

The user enters gear-related information into the input field.

### Step 4: Save Data

The application validates the entered information before saving.

### Step 5: View Results

The Detail View screen displays the stored gear list and results.

---

## Error Handling

The application includes validation to ensure:

* Input fields are not left empty.
* Invalid entries are rejected.
* Toast messages notify users when incorrect data is entered.

Example:

```kotlin
Toast.makeText(
    this,
    "Please enter valid gear information",
    Toast.LENGTH_SHORT
).show()
```

---

## Installation

1. Open Android Studio.
2. Select **Open Existing Project**.
3. Navigate to the project folder.
4. Allow Gradle to sync.
5. Run the application on:

   * Android Emulator, or
   * Physical Android Device.

---

## Future Improvements

* Store gear information using arrays or ArrayLists.
* Add RecyclerView for displaying gear items.
* Implement data persistence using SharedPreferences or SQLite.
* Improve input validation.
* Add a navigation button from HomeActivity to DetailView.
* Improve UI design and user experience.

---

## ST10537135

**Student IMAD Examination Project**

this message was made by AI(stated by ST10537135)

Developed using Kotlin and Android Studio as part of an Introduction to Mobile Application Development (IMAD) assessment project.
