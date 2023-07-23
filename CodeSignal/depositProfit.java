int solution(int deposit, int rate, int threshold) {
    int count = 0;
    double amount = (double) deposit;
    while (amount < (double) threshold) {
        count++;
        amount *= (1 + rate/100.0);
    }
    return count;
}
