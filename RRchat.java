import java.util.*;
class Process {
    String name;
    int arrivalTime;
    int burstTime;
    int remainingTime;

    public Process(String name, int arrivalTime, int burstTime) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
    }
}

public class RRchat{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of processes: ");
        int numProcesses = scanner.nextInt();

        System.out.print("Enter the time quantum: ");
        int timeQuantum = scanner.nextInt();

        Process[] processes = new Process[numProcesses];

        for (int i = 0; i < numProcesses; i++) {
            System.out.print("Enter the name of process " + (i + 1) + ": ");
            String name = scanner.next();
            System.out.print("Enter the arrival time for process " + (i + 1) + ": ");
            int arrivalTime = scanner.nextInt();
            System.out.print("Enter the burst time for process " + (i + 1) + ": ");
            int burstTime = scanner.nextInt();
            processes[i] = new Process(name, arrivalTime, burstTime);
        }

        Queue<Process> processQueue = new ArrayDeque<>();
        int currentTime = 0; // Keeps track of the current time

        // Sort processes based on arrival time
        java.util.Arrays.sort(processes, (p1, p2) -> Integer.compare(p1.arrivalTime, p2.arrivalTime));

        for (Process process : processes) {
            processQueue.add(process);
        }

        roundRobinScheduling(processQueue, timeQuantum, currentTime);

        scanner.close();
    }

    private static void roundRobinScheduling(Queue<Process> processQueue, int timeQuantum, int currentTime) {
        while (!processQueue.isEmpty()) {
            Process currentProcess = processQueue.poll();

            // Check if the process has arrived
            if (currentProcess.arrivalTime > currentTime) {
                // Process has not arrived yet, move time forward
                currentTime++;
                processQueue.add(currentProcess); // Add the process back to the queue
            } else {
                // Execute the process for the given time quantum
                int executionTime = Math.min(timeQuantum, currentProcess.remainingTime);
                System.out.println("Executing " + currentProcess.name + " for time " + executionTime);

                // Update remaining time for the process
                currentProcess.remainingTime -= executionTime;
                currentTime += executionTime;

                // Check if the process is not yet completed
                if (currentProcess.remainingTime > 0) {
                    // Add the process back to the queue for the next round
                    processQueue.add(currentProcess);
                } else {
                    // Process is completed
                    System.out.println(currentProcess.name + " is completed.");
                }
            }
        }
    }
}
