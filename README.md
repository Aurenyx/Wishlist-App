# 📱Wishlist App

A simple yet powerful Wishlist application for Android, built entirely with modern Android development tools. This app allows users to create, view, update, and delete their wishes, providing a seamless and reactive user experience.

## Features

*   **Add a Wish:** Easily add a new wish with a title and a description.
*   **View All Wishes:** See a list of all your wishes.
*   **Update a Wish:** Modify the title or description of an existing wish.
*   **Delete a Wish:** Remove a wish you no longer need.
*   **Offline Support:** Your wishlist is stored locally on your device.

## Core Components & Technologies Used

This project is built using a modern tech stack, following Google's recommended architecture for building robust and maintainable apps.

### 1. UI Layer

*   **Jetpack Compose:** The entire user interface is built with Jetpack Compose, a modern declarative UI toolkit for Android. [1] This allows for building the UI with less code, powerful tools, and intuitive Kotlin APIs. The UI components are reactive and update automatically when the underlying data changes.
*   **Compose Navigation:** The navigation between different screens (like the main wish list and the add/edit wish screen) is handled by `navigation-compose`, which provides a seamless way to manage navigation in a Compose-based app.
*   **Material Design 3:** The app's styling is based on Material Design 3, the latest version of Google's design system, providing a modern and visually appealing user interface. [3]

### 2. ViewModel Layer

*   **ViewModel:** As seen in `WishViewModel.kt`, we use `androidx.lifecycle.ViewModel` to hold and manage UI-related data. The ViewModel survives configuration changes like screen rotations, ensuring data persistence. It acts as a bridge between the UI and the data layer (Repository).
*   **State Management:** The UI state, such as the `wishTitleState` and `wishDescriptionState`, is managed using `mutableStateOf`. This makes the UI reactive, as it automatically recomposes when the state changes.

### 3. Data Layer

*   **Repository Pattern:** The `WishRepository` is used to abstract the data source. It provides a clean API for the `WishViewModel` to interact with, without needing to know where the data comes from (e.g., a local database or a remote server).
*   **Room Persistence Library:** Room is used as the local database to store the wishes. It's an abstraction layer over SQLite that allows for more robust database access while harnessing the full power of SQLite. [2] It provides compile-time checks of SQL queries and returns `Flow` objects to create reactive data streams.
*   **Kotlin Coroutines & Flow:** All data operations, such as adding, updating, or fetching wishes, are performed asynchronously using Kotlin Coroutines. This ensures that these operations don't block the main thread, keeping the app's UI responsive. We use `kotlinx.coroutines.flow.Flow` to get real-time updates from the database. When a wish is added or changed in the database, the UI observing the `Flow` will automatically update. [4]

## How it all works together

1.  **UI (Compose Screens):** The user interacts with the UI. For example, they tap a button to add a new wish.
2.  **ViewModel (`WishViewModel`):** The UI calls a function in the `WishViewModel` (e.g., `addWish(wish)`).
3.  **Repository (`WishRepository`):** The `WishViewModel` then calls the corresponding function in the `WishRepository`, which abstracts the data source.
4.  **Data Source (Room Database):** The `WishRepository` uses the Room database to perform the actual data operation (e.g., inserting the new wish).
5.  **Reactive Updates (Flow):** The Room database emits a new list of wishes through a `Flow`.
6.  **UI Update:** The `WishViewModel` collects this `Flow`, and because the UI is observing this data, Jetpack Compose automatically recomposes the relevant parts of the screen to display the new wish.

## Screenshots
<img src="https://github.com/user-attachments/assets/3faa9799-d52e-44e8-ae04-1a7deee1c7fd" width="300"/>
<img src="https://github.com/user-attachments/assets/cdda7b11-927c-4af9-9c60-a6cccea60911" width="300" height="600"/>
<img src="https://github.com/user-attachments/assets/addb4fb3-4755-4d76-a463-6c71f32b008a" width="300" height="600"/>


## Licence 
* This project is open-source. You are free to use, modify, and improve it.
  
This architecture creates a reactive and efficient application that is both scalable and easy to maintain.

## 👨‍💻 Developer
### Mr. Aurenyx
- GitHub: (https://github.com/Aurenyx)
- LinkedIn: (https://www.linkedin.com/in/govindgulhane)
