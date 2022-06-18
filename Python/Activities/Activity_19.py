# Activity_19
# Using Pandas Writing 5 rows of data to Excel File having below coloumn headings
# Coloumns: 'FirstName', 'LastName', 'Email', 'PhoneNumber'
# Import pandas
import pandas
from pandas import ExcelWriter

# Create a dictionary that will be used to create the DataFrame
data = {
    'FirstName':["Satvik", "Avinash", "Lahri", "Kapil", "Sandeep"],
    'LastName':["Reddy", "Singh", "Guptha", "Patil", "Mishra"],
    'Email':["SatvikReddy@example.com", "avinashsingh@example.com", "lahri.guptha@example.com", "kapilpatil@example.com", "SandeepMishra@example.com"],
    'PhoneNumber':["4537829158", "4892184058", "4537829158", "4892184058", "4528727830"]
}

# Create the DataFrame that will be written to the excel file
dataframe = pandas.DataFrame(data)

# Print the dataframe
print(dataframe)

# Write the dataframe to a Excel file
writer = ExcelWriter('sample.xlsx')
dataframe.to_excel(writer, 'Sheet1', index = False)

# Commit data to the Excel file
writer.save()