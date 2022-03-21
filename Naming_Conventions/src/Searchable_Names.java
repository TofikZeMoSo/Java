public class Searchable_Names {

    //// Avoid Encodings

    //Use Searchable Names
    //Single-letter names and numeric constants have a particular problem
    // in that they are not easy to locate across a body of text.

    int s;
    int t[];

    public void wrongExample() {
        for (int j = 0; j < 34; j++) {

            s += (t[j] * 4) / 5;
        }
    }

//  above example is wrong in many ways but we can
// name e is a poor choice for any variable for which a programmer might need to search.
// It is the most common letter in the English language and likely to show up in every passage of text in every program.
// single-letter names can ONLY be used as local variables inside short methods

    int realDaysPerIdealDay = 4;
    final int WORK_DAYS_PER_WEEK = 5;
    int NUMBER_OF_TASKS=34;
    int taskEstimate[];
    int sum = 0;
    public void rightExample() {
        for(int j = 0;j<NUMBER_OF_TASKS;j++) {

            int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;

            int realTaskWeeks = (realTaskDays/ WORK_DAYS_PER_WEEK);

            sum += realTaskWeeks;
        }

    }
}

