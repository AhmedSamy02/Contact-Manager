# 📘 Android Mini Project Series

This document presents a structured journey for Android beginners to practice core app components—**Activities**, **UI Design (XML)**, **Jetpack Compose**, and **resource management**—through three progressive tasks. One of the tasks is tailored as a **Contact Manager** to simulate a real-world app use case.

---

## ✅ Task 1: Hello Android App (Activities + Intents + Lifecycle Logging)

### 🎯 Objective:
Create a basic Android app with two activities to understand activity navigation, lifecycle logging, and intent handling.

### ✨ Features:

#### 🔹 Two Activities:

- **MainActivity:**
  - `TextView` welcoming the user.
  - `Button` to navigate to `SecondActivity`.

- **SecondActivity:**
  - `TextView` showing a second message.
  - `Button` to return to `MainActivity`.

#### 🔹 Lifecycle Logging:
Log these lifecycle methods in **both activities** using `Log.d()`:
- `onCreate`, `onStart`, `onResume`, `onPause`, `onStop`, `onDestroy`

#### 🔹 Intent Handling:
- Use **explicit intent** to navigate from `MainActivity` to `SecondActivity`.
- Add a **share button** that uses an **implicit intent** to share a message via available apps.

---

## 📱 Task 2: Contact Manager UI (Static XML Screen)

### 🎯 Objective:
Design a simple **Contact Management UI screen** using XML layouts with best practices in resource and attribute management.

### ✨ Features:

#### 🔹 Layout Structure:
- Use `ConstraintLayout` as root.
- Nest a `LinearLayout` or `FrameLayout` inside for logical grouping.

#### 🔹 UI Elements:
- `TextView` – shows the contact's name (`tvContactName`)
- `ImageView` – displays contact photo (`ivContactImage`)
- `EditText` – for editing contact notes (`etContactNotes`)
- `Button` – labeled **"Save Contact"** (`btnSaveContact`)

#### 🔹 Resources:
- Store strings in `res/values/strings.xml`
- Use `res/values/colors.xml` for color customization
- Define margins/paddings in `res/values/dimens.xml`
- Use placeholder drawable from `res/drawable/`

#### 🔹 Attribute Practice:
Apply at least 5 common attributes, such as:
- `textSize`
- `textColor`
- `layout_margin`
- `padding`
- `gravity`

#### 🔹 ID & Naming Convention:
Use consistent naming like:
- `tvContactName`
- `btnSaveContact`
- `ivContactImage`
- `etContactNotes`

---

Feel free to expand these tasks or integrate them into a larger app project!
