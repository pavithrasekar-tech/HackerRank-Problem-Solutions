class Calender{
public static String findDay(int month, int day, int year) {
    // Create a Calendar instance
    Calendar calendar = Calendar.getInstance();
    
    // Set the calendar to the given date
    calendar.set(year, month - 1, day); // Month is 0-based, so subtract 1
    
    // Get the day of the week
    int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
    
    // Array of day names
    String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
    
    // Return the corresponding day name
    return days[dayOfWeek - 1];
}
}
public static void main(String[] args) throws IOException {
    // Read input from standard input
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    // Parse input
    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
    int month = Integer.parseInt(firstMultipleInput[0]); // Parse month
    int day = Integer.parseInt(firstMultipleInput[1]);   // Parse day
    int year = Integer.parseInt(firstMultipleInput[2]);  // Parse year

    // Call the findDay method
    String res = Result.findDay(month, day, year);

    // Write the result to standard output
    bufferedWriter.write(res);
    bufferedWriter.newLine();

    // Close the readers and writers
    bufferedReader.close();
    bufferedWriter.close();
}

