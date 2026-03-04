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

## PDF Practical Steps (As per PDF Flow)

### Practical 1 - StudentProfileViewer
1. Create project: `StudentProfileViewer` (Java, min SDK 21, Empty Views Activity).
2. Replace `activity_main.xml` with student input form (name, roll, course, email, button).
3. Create `ProfileActivity` and set `activity_profile.xml` with output TextViews.
4. Add `LoggingService.java` for logging profile access.
5. Update `MainActivity.java` to send data by Intent to `ProfileActivity`.
6. In `ProfileActivity.java`, receive data, display it, and start service.
7. Register service in manifest: `<service android:name=".LoggingService" />`.
8. Run and verify Logcat with `LoggingService` tag.

### Practical 2.1 - Custom Colors
1. Create project: `Practical2_1_CustomColors` (Java, min SDK 21).
2. Set custom colors in `res/values/colors.xml`.
3. Set `activity_main.xml` with single `TextView`.
4. In `MainActivity.java`, apply background/text colors using resource IDs.
5. Run and verify colored text output.

### Practical 2.2 - ResourceDemoApp
1. Create project: `ResourceDemoApp` (Java, min SDK 21).
2. Add strings in `res/values/strings.xml` for light/dark mode text and button labels.
3. Add color resources in `res/values/colors.xml`.
4. Replace `activity_main.xml` with `RelativeLayout`, center text and bottom toggle button.
5. In `MainActivity.java`, toggle light/dark mode with button click.
6. Run and verify text/background/button label changes.

### Practical 2.3 - CollegeNoticeApp (Drawable + Dimens)
1. Create project: `CollegeNoticeApp` (Java, min SDK 21).
2. Add drawable resource (`logo`) in `res/drawable`.
3. Create `res/values/dimens.xml` and define size/padding/text dimensions.
4. Replace `activity_main.xml` using `ImageView` + `TextView` and `@dimen` values.
5. Keep default `MainActivity.java`.
6. Run and verify consistent spacing and sizing.

### Practical 4.1 - StudentProfileLinearLayout
1. Create project: `StudentProfileLinearLayout`.
2. Replace `activity_main.xml` with vertical + horizontal `LinearLayout` rows for student details.
3. Keep default `MainActivity.java` (static UI practical).
4. Run and verify layout orientation concepts.

### Practical 4.2 - LoginRelativeLayout
1. Create project: `LoginRelativeLayout`.
2. Replace `activity_main.xml` with title, username, password, login button in `RelativeLayout`.
3. Keep/set `MainActivity.java` with `setContentView`.
4. Run and verify relative positioning.

### Practical 4.3 - MarkSheetTableLayout
1. Create project: `MarkSheetTableLayout`.
2. Replace `activity_main.xml` with `TableLayout` for subject/marks rows.
3. Keep default activity logic (UI-only practical).
4. Run and verify table output.

### Practical 4.4 - ContactListViewApp
1. Create project: `ContactListViewApp`.
2. Replace `activity_main.xml` with EditText + Add button + ListView.
3. In `MainActivity.java`, use `ArrayList` + `ArrayAdapter`.
4. On add click, append name to list and refresh adapter.
5. Run and verify dynamic list entries.

### Practical 4.5 - DynamicGridViewApp
1. Create project: `DynamicGridViewApp`.
2. Replace `activity_main.xml` with EditText + button + GridView (`numColumns=2`).
3. In `MainActivity.java`, use `ArrayList` + `ArrayAdapter` for grid.
4. On add click, insert item and refresh adapter.
5. Run and verify dynamic grid entries.

### Practical 8.1 - StartedServiceCounter
1. Create project: `StartedServiceCounter`.
2. Create `CounterService.java` with `Handler`/`Runnable` counter logging every second.
3. Register service in manifest (`android:exported="false"`).
4. Replace `activity_main.xml` with Start/Stop service buttons.
5. Update `MainActivity.java` to `startService()` and `stopService()`.
6. Run and verify counter logs in Logcat (`CounterService`).

### Practical 8.2 - Notification
1. Create project: `Notification`.
2. Replace `activity_main.xml` with `Generate Notification` button.
3. In `MainActivity.java`, create notification channel and build notification on click.
4. Add `POST_NOTIFICATIONS` permission in manifest.
5. Run and verify notification panel output and click behavior.

### Practical 9 - SQLiteDemo
1. Create project: `SQLiteDemo`.
2. Create `DatabaseHelper.java` extending `SQLiteOpenHelper`.
3. Add methods: insert, view all, update, delete.
4. Replace `activity_main.xml` with ID/Name/Marks fields and action buttons.
5. In `MainActivity.java`, wire button listeners to DB operations.
6. Run and test insert/view/update/delete flow.

### Practical 10 - CameraPermissionApp
1. Create project: `CameraPermissionApp` (min SDK 23+).
2. Add camera permission in manifest.
3. Replace `activity_main.xml` with request permission button.
4. In `MainActivity.java`, check permission, request if needed, and handle callback.
5. Run and verify granted/denied toast messages.

---

## Note
This repository stores practical source files by practical folder. Some folders are code/resource sets and may need standard Android Studio project scaffolding (Gradle files, themes, manifests) when recreated as full runnable projects.
