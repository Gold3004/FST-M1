# Activity 17
# Using Pandas: Write the data (list of Usernames/passwords) into a CSV file.

import pandas

# Create a Dictionary that will hold our data
data = {
    "Usernames": ["admin", "Charles1231", "Charles1232", "Charles1234", "Charles1235"],
    "Passwords": ["password", "Angel1123", "Angel1123","Angel1123", "Angel1123"]
}

# Create a DataFrame using that data
dataframe = pandas.DataFrame(data)

# Print the DataFrame
print(dataframe)

"""
 Write the DataFrame to a CSV file
 To avoid writing the index numbers to the file as well
 the index property is set to false
"""
dataframe.to_csv('C:/Users/02003C744/Desktop/sample.csv', index=False)