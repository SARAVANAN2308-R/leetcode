int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
   int states = minutesToTest / minutesToDie + 1;
    int pigs = 0;
    int total = 1;
    while (total < buckets) {
        total = total * states;
        pigs++;
    }
    return pigs; 
}