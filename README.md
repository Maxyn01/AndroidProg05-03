# Extracted Android Practicals

This repository contains practical source code extracted from:
- `Prcatical_03.docx`
- `Practical_05.docx`
- `Practical 06.docx`
- `LFnAm_prac_07.docx`
- `f548w_Practicals_AMP.pdf`

## Practical Folders
- `Practical_01_StudentProfileViewer`
- `Practical_02_1_CustomColors`
- `Practical_02_2_ResourceDemo`
- `Practical_02_3_CollegeNotice`
- `Practical_03_1_ActivityLifeCycle`
- `Practical_03_2_WelcomeMessage`
- `Practical_03_3_FragmentCommunication`
- `Practical_04_1_StudentProfileLinearLayout`
- `Practical_04_2_LoginRelativeLayout`
- `Practical_04_3_MarkSheetTableLayout`
- `Practical_04_4_ContactListViewApp`
- `Practical_04_5_DynamicGridViewApp`
- `Practical_05_1_DynamicAppBar`
- `Practical_05_2_FragmentCalculator`
- `Practical_06_1_MenuDialog`
- `Practical_07_CollegeEventApp`
- `Practical_08_1_StartedServiceCounter`
- `Practical_08_2_Notification`
- `Practical_09_SQLiteDemo`
- `Practical_10_CameraPermissionApp`

---

## PDF Practical Steps (From Beginning, PDF Style)

### Practical 1 - StudentProfileViewer
1. Open Android Studio -> `New Project` -> `Empty Views Activity`.
2. Project config:
   - Name: `StudentProfileViewer`
   - Package: `com.example.studentprofileviewer`
   - Language: `Java`
   - Minimum SDK: `API 21`
3. Replace `activity_main.xml` with student input form UI.
4. Create new activity: `ProfileActivity` and set `activity_profile.xml`.
5. Create new Java class: `LoggingService.java`.
6. Replace `MainActivity.java`, `ProfileActivity.java`, `LoggingService.java` with provided code.
7. Add service in manifest inside `<application>`:
   - `<service android:name=".LoggingService" />`
8. Run app -> enter details -> click `View Profile` -> verify Logcat tag `LoggingService`.

### Practical 2.1 - Custom Colors
1. Open Android Studio -> `New Project` -> `Empty Views Activity`.
2. Project config:
   - Name: `Practical2_1_CustomColors`
   - Language: `Java`
   - Minimum SDK: `API 21`
3. Open `res/values/colors.xml` and add custom colors.
4. Replace `res/layout/activity_main.xml` with TextView layout.
5. Replace `MainActivity.java` to apply colors from resources.
6. Run app and verify orange background/white text output.

### Practical 2.2 - ResourceDemoApp
1. Open Android Studio -> `New Project` -> `Empty Views Activity`.
2. Project config:
   - Name: `ResourceDemoApp`
   - Language: `Java`
   - Minimum SDK: `API 21`
3. Update `res/values/strings.xml` with light/dark text and button labels.
4. Update `res/values/colors.xml` with light/dark colors.
5. Replace `res/layout/activity_main.xml` with RelativeLayout and toggle button.
6. Replace `MainActivity.java` with dark/light mode toggle logic.
7. Run app and test button toggles both UI modes.

### Practical 2.3 - CollegeNoticeApp
1. Open Android Studio -> `New Project` -> `Empty Views Activity`.
2. Project config:
   - Name: `CollegeNoticeApp`
   - Package: `com.example.collegenoticeapp`
   - Language: `Java`
   - Minimum SDK: `API 21`
3. Add image in `res/drawable` (`logo`) or keep provided drawable placeholder.
4. Create `res/values/dimens.xml` and add all dimension values.
5. Replace `res/layout/activity_main.xml` using `@dimen` references.
6. Keep default `MainActivity.java` (or provided equivalent).
7. Run app and verify spacing/sizing consistency.

### Practical 4.1 - StudentProfileLinearLayout
1. Open Android Studio -> `New Project` -> `Empty Views Activity`.
2. Project config:
   - Name: `StudentProfileLinearLayout`
   - Package: `com.example.studentprofile`
   - Language: `Java`
3. Replace `res/layout/activity_main.xml` with LinearLayout student profile design.
4. Keep default `MainActivity.java`.
5. Run app and verify vertical + horizontal orientation.

### Practical 4.2 - LoginRelativeLayout
1. Open Android Studio -> `New Project` -> `Empty Views Activity`.
2. Project config:
   - Name: `LoginRelativeLayout`
   - Package: `com.example.loginrelativelayout`
   - Language: `Java`
3. Replace `res/layout/activity_main.xml` with RelativeLayout login screen.
4. Keep/replace `MainActivity.java` with basic `setContentView` activity.
5. Run app and verify relative positioning of controls.

### Practical 4.3 - MarkSheetTableLayout
1. Open Android Studio -> `New Project` -> `Empty Views Activity`.
2. Project config:
   - Name: `MarkSheetTableLayout`
   - Language: `Java`
3. Replace `res/layout/activity_main.xml` with TableLayout mark-sheet UI.
4. Keep default `MainActivity.java`.
5. Run app and verify rows/columns display correctly.

### Practical 4.4 - ContactListViewApp
1. Open Android Studio -> `New Project` -> `Empty Views Activity`.
2. Project config:
   - Name: `ContactListViewApp`
   - Package: `com.example.contactlistviewapp`
   - Language: `Java`
3. Replace `res/layout/activity_main.xml` with EditText + Add + ListView.
4. Replace `MainActivity.java` with ArrayList + ArrayAdapter logic.
5. Run app and add contacts dynamically.

### Practical 4.5 - DynamicGridViewApp
1. Open Android Studio -> `New Project` -> `Empty Views Activity`.
2. Project config:
   - Name: `DynamicGridViewApp`
   - Package: `com.example.dynamicgridviewapp`
   - Language: `Java`
3. Replace `res/layout/activity_main.xml` with EditText + Button + GridView.
4. Replace `MainActivity.java` with dynamic grid adapter logic.
5. Run app and verify items are added in grid format.

### Practical 8.1 - StartedServiceCounter
1. Open Android Studio -> `New Project` -> `Empty Views Activity`.
2. Project config:
   - Name: `StartedServiceCounter`
   - Package: `com.example.startedservicecounter`
   - Language: `Java`
   - Minimum SDK: `API 21`
3. Create Java class `CounterService.java` and paste service code.
4. Register service in manifest:
   - `<service android:name=".CounterService" android:enabled="true" android:exported="false" />`
5. Replace `activity_main.xml` with Start/Stop buttons.
6. Replace `MainActivity.java` with `startService()`/`stopService()` logic.
7. Run app and verify counter logs in Logcat (`CounterService`).

### Practical 8.2 - Notification
1. Open Android Studio -> `New Project` -> `Empty Views Activity`.
2. Project config:
   - Name: `Notification`
   - Package: `com.example.notification`
   - Language: `Java`
3. Replace `activity_main.xml` with notification button.
4. Replace `MainActivity.java` with channel + notification builder code.
5. Add manifest permission:
   - `<uses-permission android:name="android.permission.POST_NOTIFICATIONS" />`
6. Run app -> click button -> check notification tray.

### Practical 9 - SQLiteDemo
1. Open Android Studio -> `New Project` -> `Empty Views Activity`.
2. Project config:
   - Name: `SQLiteDemo`
   - Package: `com.example.sqlitedemo`
   - Language: `Java`
   - Minimum SDK: `API 21`
3. Create class `DatabaseHelper.java` and paste SQLite helper code.
4. Replace `activity_main.xml` with ID/Name/Marks fields and CRUD buttons.
5. Replace `MainActivity.java` with insert/view/update/delete handlers.
6. Run app and test all CRUD operations.

### Practical 10 - CameraPermissionApp
1. Open Android Studio -> `New Project` -> `Empty Views Activity`.
2. Project config:
   - Name: `CameraPermissionApp`
   - Package: `com.example.camerapermissionapp`
   - Language: `Java`
   - Minimum SDK: `API 23+`
3. Add permission in manifest:
   - `<uses-permission android:name="android.permission.CAMERA" />`
4. Replace `activity_main.xml` with `Request Camera Permission` button.
5. Replace `MainActivity.java` with runtime permission check/request/callback.
6. Run app and verify granted/denied toast messages.

---

## Note
This repository stores practical source files by practical folder. Some folders are code/resource sets and may need standard Android Studio project scaffolding (Gradle files, themes, manifests) when recreated as full runnable projects.

## SDK/Version Setup (Where To Change)

### In Android Studio (UI Method)
1. Open project in Android Studio.
2. Go to `File` -> `Project Structure`.
3. Open `Project` tab:
   - `Project SDK` / `Android Gradle Plugin` compatibility
4. Open `Modules` -> `app`:
   - `Compile SDK Version`
   - `Min SDK Version`
   - `Target SDK Version`
5. Click `Apply` -> `OK` -> `Sync Now`.

### In Gradle Files (Code Method)
Open `app/build.gradle` (or `app/build.gradle.kts`) and set:
```gradle
android {
    compileSdk 35
    defaultConfig {
        minSdk 21
        targetSdk 35
    }
}
```
Use installed SDK values on your PC.  
For `Practical 10 (CameraPermissionApp)`, keep `minSdk` as `23` or above.

### Where To Fix Other Common Issues
1. Manifest errors:
   - File: `app/src/main/AndroidManifest.xml`
   - Add missing `activity`, `service`, `uses-permission` entries.
2. Theme/style errors:
   - Files: `res/values/themes.xml`, `res/values/styles.xml`
   - Ensure manifest theme exists (for example `@style/Theme.AppName`).
3. Package mismatch:
   - Java package at top of `.java` file must match app package structure.
4. Notification issues (Practical 8.2):
   - Add `POST_NOTIFICATIONS` permission in manifest.
   - On Android 13+, notification runtime permission may be required.
5. Camera permission issues (Practical 10):
   - Add camera permission in manifest.
   - Keep runtime permission code and callback in `MainActivity`.
