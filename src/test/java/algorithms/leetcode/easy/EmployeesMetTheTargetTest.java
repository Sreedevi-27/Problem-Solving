package algorithms.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeesMetTheTargetTest {

    @Test
    void numberOfEmployeesWhoMetTarget() {
        int expectedNumberOfEmployeesWhoMetTarget = 3;
        int actualNumberOfEmployeesWhoMetTarget = EmployeesMetTheTarget.numberOfEmployeesWhoMetTarget(new int[]{0, 1, 2, 3, 4}, 2);
        assertEquals(expectedNumberOfEmployeesWhoMetTarget, actualNumberOfEmployeesWhoMetTarget);
    }
}