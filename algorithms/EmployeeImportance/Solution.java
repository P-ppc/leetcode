/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int importance = 0;
        List<Employee> stack = new ArrayList<Employee>();
        
        for (Employee e : employees) {
            if (e.id == id) {
                stack.add(e);
            }
        }
        
        while (stack.size() > 0) {
            Employee employee = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            importance += employee.importance;
            for (Employee e : employees) {
                if (employee.subordinates.contains(e.id)) {
                    stack.add(e);
                }
            }
        }
        return importance;
    }
}