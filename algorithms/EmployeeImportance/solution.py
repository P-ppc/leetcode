"""
# Employee info
class Employee(object):
    def __init__(self, id, importance, subordinates):
        # It's the unique id of each node.
        # unique id of this employee
        self.id = id
        # the importance value of this employee
        self.importance = importance
        # the id of direct subordinates
        self.subordinates = subordinates
"""
class Solution(object):
    def getImportance(self, employees, id):
        """
        :type employees: Employee
        :type id: int
        :rtype: int
        """
        importance = 0
        stack = []
        for employee in employees:
            if employee.id == id:
                stack.append(employee)
        
        while len(stack) > 0:
            employee = stack.pop()
            importance += employee.importance
            for e in employees:
                if e.id in employee.subordinates:
                    stack.append(e)
        return importance
        