SELECT e1.name
FROM employee e
JOIN employee e1
ON e.managerId = e1.id
GROUP BY e1.id, e1.name
HAVING COUNT(*) >= 5;