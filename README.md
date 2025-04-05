<div align="center">


<img src="https://github.com/user-attachments/assets/cfad8cc2-2529-422f-bd20-120f03ccb2e7" width = "300">
</div>
<div align="center">

# IDETApp
</div>
<br>
This repository contains an Android application project developed as part of an assignment. The app demonstrates the use of various Android Fragment-related components and behaviors.

## 📋 Assignment Requirements

The project satisfies the following features:

- ✅ Fragment `safeArgs`
- ✅ Fragment animation
- ✅ Fragment with bottom navigation bar
- ✅ Fragment with `TabLayout`
- ✅ Fragment with swipeable pages

## 🚀 Features

This app showcases:

- **Navigation Components**: Use of `safeArgs` for type-safe fragment navigation.
- **Fragment Animations**: Smooth transitions between fragments using custom animations.
- **Bottom Navigation**: A bottom navigation bar that allows switching between core sections of the app.
- **TabLayout Integration**: Tabs for navigating between different views within a fragment.
- **ViewPager2**: Implementation of swipeable pages using `ViewPager2`.

## UI

<div align="center">
  <h2 align="center">Splash Fragment | First Fragment | Second Fragment</h2>
<img src="https://github.com/user-attachments/assets/c3827b8e-7683-4ca7-8858-09244d649ab8" width = "220">
<img src="https://github.com/user-attachments/assets/5530a74a-e96d-48ae-8c1b-a53f7657c6d9" width = "220">
  <img src="https://github.com/user-attachments/assets/f03e8c00-f9b5-4a64-9f24-7155266f963f" width = "220">
</div>
  <div align="center">
    <h2 align="center">Fragments with TabLayout</h2>
  <img src="https://github.com/user-attachments/assets/33a921c2-f005-4ca5-b1d8-0061c7cab52d" width = "220">
  <img src="https://github.com/user-attachments/assets/aa293452-ab8b-45d9-9d31-e7b5b45c1b5a" width = "220">
  <img src="https://github.com/user-attachments/assets/ef59161c-077d-4505-9edd-08e3174fa2b9" width = "220">
  <img src="https://github.com/user-attachments/assets/49773d59-68e5-476d-bb4a-a0c411d445ff" width = "220">
    </div>
  <div align="center">
    <h2 align="center">Fragment with bottom navigation bar</h2>
  <img src="https://github.com/user-attachments/assets/b4535436-1e55-4bce-ace6-82946d2a4a66" width = "220">
  <img src="https://github.com/user-attachments/assets/84561e6d-1077-4231-b010-dcc0ce20fde4" width = "220">
  <img src="https://github.com/user-attachments/assets/279c1229-002b-4ea6-a0db-0bb70c1fb74b" width = "220">
  <img src="https://github.com/user-attachments/assets/f53770f9-69b0-47ee-9dec-f100cd4b4643" width = "220">
</div>

## 🛠️ Getting Started

### Prerequisites

- Android Studio (Arctic Fox or newer)
- Kotlin
- Android SDK 21+

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/cusaldmsr/IDETApp.git
   ```
2. Open the project in Android Studio.

3. Let Gradle sync and build the project.

4. Run the app on an emulator or physical device.


## 📂 Project Structure

```bash
IDETApp/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/idetapp/
│   │   │   │   ├── ui/         # Fragments and UI logic
│   │   │   │   ├── adapters/   # ViewPager/TabLayout adapters
│   │   │   └── res/            # Layouts, navigation graph, etc.
│   └── build.gradle
└── build.gradle

```
## 📜 Commit History


1. **Initial Commit**  
   Set up project structure and dependencies.  
   [`71805f2`](https://github.com/cusaldmsr/IDETApp/commit/71805f2f329e21e3b482634d1033a124c752096d)

2. **Added Navigation**  
   Create a Navigation graph(fragment_navigation.xml) using created fragments & activities.  
   [`8faad27`](https://github.com/cusaldmsr/IDETApp/commit/8faad2779f02e22a24bca6f4ec054af05d4cc251)

3. **Enable Safe Args**  
   Enable Safe Args
   [`d6f3669`](https://github.com/cusaldmsr/IDETApp/commit/d6f3669d03cb2cfe698fec6991b5ddc86c18ef21)

4. **Arguments passing using Safe Args**  
   Pass arguments from FirstFragment to SecondFragment using Safe Args.  
   [`a97e0dd`](https://github.com/cusaldmsr/IDETApp/commit/a97e0ddb080fc1bfa89c18dd3d811eefea493a0d)

5. **Apply enter/exit animations for fragment transactions**  
   Smooth transitions between fragments using custom animations.  
   [`1bdde61`](https://github.com/cusaldmsr/IDETApp/commit/1bdde617a7ec24ac00ccfeeeb6fa71b6053be739)

6. **Connect fragments new fragments (Home, Friends, Video, Chat) to bottom navigation bar in BottomBarActivity**  
   A bottom navigation bar that allows switching between core sections of the app
   [`cb0bb3d`](https://github.com/cusaldmsr/IDETApp/commit/cb0bb3d885a30502e43f9adb4d23b5e9f89484c6)

7. **Implement TabLayout with ViewPager2 using custom FragmentAdapter and also make fragments swipeable.**  
   Tabs for navigating between different views within a fragment, Implementation of swipeable pages using `ViewPager2`
   [`e04f683`](https://github.com/cusaldmsr/IDETApp/commit/e04f6836f825b942679465a87b4bbd9c2c0ee16a)


## 🙋‍♂️ Author
GitHub: [@cusaldmsr](https://github.com/cusaldmsr)