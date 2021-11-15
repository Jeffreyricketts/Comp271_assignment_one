package comp271.assignment.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortPriorityQueueTest {

    @Test
    public void getsMinimum() {

        PriorityQueue priorityQueue = new MergeSortPriorityQueue(51,2,1,6,5,52,7,8,9,10,21,22,23,24,25,26,27,28,29,
                                                                          40,41,42,43,44,45,46,47,48,49,50,30,32,3,33,34,
                                                                           35,36,37,38,39,20,19,18,17,16,15,14,13,11,12);

        assertEquals(1, priorityQueue.removeMin());
        assertEquals(2, priorityQueue.removeMin());
        assertEquals(5, priorityQueue.removeMin());
        assertEquals(6, priorityQueue.removeMin());
        assertEquals(7, priorityQueue.removeMin());
        assertEquals(8, priorityQueue.removeMin());
        assertEquals(9, priorityQueue.removeMin());
        assertEquals(10, priorityQueue.removeMin());
        assertEquals(11, priorityQueue.removeMin());
        assertEquals(12, priorityQueue.removeMin());
        assertEquals(13, priorityQueue.removeMin());
        assertEquals(14, priorityQueue.removeMin());
        assertEquals(15, priorityQueue.removeMin());
        assertEquals(16, priorityQueue.removeMin());
        assertEquals(17, priorityQueue.removeMin());
        assertEquals(18, priorityQueue.removeMin());
        assertEquals(19, priorityQueue.removeMin());
        assertEquals(20, priorityQueue.removeMin());
        assertEquals(21, priorityQueue.removeMin());
        assertEquals(22, priorityQueue.removeMin());
        assertEquals(23, priorityQueue.removeMin());
        assertEquals(24, priorityQueue.removeMin());
        assertEquals(25, priorityQueue.removeMin());
        assertEquals(26, priorityQueue.removeMin());
        assertEquals(27, priorityQueue.removeMin());
        assertEquals(28, priorityQueue.removeMin());
        assertEquals(29, priorityQueue.removeMin());
        assertEquals(30, priorityQueue.removeMin());
        assertEquals(31, priorityQueue.removeMin());
        assertEquals(32, priorityQueue.removeMin());
        assertEquals(33, priorityQueue.removeMin());
        assertEquals(34, priorityQueue.removeMin());
        assertEquals(35, priorityQueue.removeMin());
        assertEquals(36, priorityQueue.removeMin());
        assertEquals(37, priorityQueue.removeMin());
        assertEquals(38, priorityQueue.removeMin());
        assertEquals(39, priorityQueue.removeMin());
        assertEquals(40, priorityQueue.removeMin());
        assertEquals(41, priorityQueue.removeMin());
        assertEquals(42, priorityQueue.removeMin());
        assertEquals(43, priorityQueue.removeMin());
        assertEquals(44, priorityQueue.removeMin());
        assertEquals(45, priorityQueue.removeMin());
        assertEquals(46, priorityQueue.removeMin());
        assertEquals(47, priorityQueue.removeMin());
        assertEquals(48, priorityQueue.removeMin());
        assertEquals(49, priorityQueue.removeMin());
        assertEquals(50, priorityQueue.removeMin());
        assertEquals(51, priorityQueue.removeMin());
        assertEquals(52, priorityQueue.removeMin());

    }
}