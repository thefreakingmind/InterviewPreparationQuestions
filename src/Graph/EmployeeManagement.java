package Graph;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};


class Solution {
    static int empID;
    public int getImportance(List<Employee> employees, int id) {

        int totalEmployee = 0;
        Map<Integer, Employee> map = new HashMap<>();

        for(int i=0; i<employees.size(); i++){
            empID = employees.get(i).id;
            Employee employee = employees.get(i);
            map.put(empID, employee);

        }

        Stack<Integer> stack = new Stack<>();
        stack.push(id);

        while (!stack.isEmpty()){


        }


        return totalEmployee;



    }
}