# Team-Strawberry


### Methodology
First, we created a series of Arrays all sized using a 1^n scale: 1, 10, 100, 1000, 10000, 100000, 1000000

In order to determine the runtime, like every other team, we used System.nanoTime()

We measured it before we had run sort() on any array of our choosing. Then we ran the merge sort for each arary ten times, and then straight afterwards.
We then subtracted the end time from the start time and divided it by 10^9 (to convert nanoseconds to seconds). Then, to calculate the average for each run, we divided the difference by ten.

### Findings
When comparing our graph to a graph of bigO(nlog(n)), they appear to be very close to each other, which led us to believe that we had achieved nlog(n) runtime






Link to Google Spreadsheet with graphs:
https://docs.google.com/spreadsheets/d/1aEcmv949LVsjsTOsA_ej9qNEcmJOd7Ak8g0dQ4nLm9M/pubhtml
