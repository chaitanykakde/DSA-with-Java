import tkinter as tk
from tkinter import messagebox
from PIL import Image, ImageTk
import os

# Create the main window
root = tk.Tk()
root.title("Custom Login Page")
root.geometry("600x400")

# Path to the image file
image_path = "background.png"  # Replace with your image path

# Check if the image file exists
if not os.path.exists(image_path):
    print(f"Error: The image file '{image_path}' was not found.")
else:
    # Load and set the background image (simulate gradient background)
    background_image = Image.open(image_path)  # Open the image
    background_image = background_image.resize((600, 400), Image.ANTIALIAS)  # Resize the image
    background_photo = ImageTk.PhotoImage(background_image)

    background_label = tk.Label(root, image=background_photo)
    background_label.place(relwidth=1, relheight=1)

# Frame to hold the login part
login_frame = tk.Frame(root, bg="white", bd=5)
login_frame.place(relx=0.1, rely=0.15, relwidth=0.35, relheight=0.7)

# Welcome message
welcome_label = tk.Label(login_frame, text="Hello, welcome!", font=("Helvetica", 18, "bold"), fg="#5f00ba", bg="white")
welcome_label.pack(pady=20)

# Create username label and entry field
label_username = tk.Label(login_frame, text="Username:", font=("Helvetica", 12), bg="white")
label_username.pack(pady=10)
entry_username = tk.Entry(login_frame, font=("Helvetica", 12), bd=2)
entry_username.pack(pady=5)

# Create password label and entry field
label_password = tk.Label(login_frame, text="Password:", font=("Helvetica", 12), bg="white")
label_password.pack(pady=10)
entry_password = tk.Entry(login_frame, show="*", font=("Helvetica", 12), bd=2)
entry_password.pack(pady=5)

# Function to verify login credentials
def login():
    username = entry_username.get()
    password = entry_password.get()

    # Hardcoded credentials for demo purposes
    if username == "admin" and password == "1234":
        messagebox.showinfo("Login Status", "Login Successful!")
    else:
        messagebox.showerror("Login Status", "Invalid username or password")

# Create login button
login_button = tk.Button(login_frame, text="Login", font=("Helvetica", 12, "bold"), bg="#5f00ba", fg="white", command=login)
login_button.pack(pady=15)

# Create signup button
signup_button = tk.Button(login_frame, text="Sign Up", font=("Helvetica", 12, "bold"), bg="white", fg="#5f00ba", bd=2)
signup_button.pack(pady=10)

# Run the main loop
root.mainloop()
