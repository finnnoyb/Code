import random
import string

# Define character sets
lowercase = string.ascii_lowercase
uppercase = string.ascii_uppercase
digits = string.digits
punctuation = string.punctuation


length = int(input("How long should the password be? "))
password = ""

# Generate password by picking random characters from all sets
for i in range(length):
    # Choose a random character from all available sets
    all_chars = lowercase + uppercase + digits + punctuation
    password += random.choice(all_chars)

print("Generated password:", password)