# Write your MySQL query statement below
SELECT a1.machine_id ,  round(avg(a2.timestamp - a1.timestamp),3) as processing_time
FROM Activity a1
JOIN Activity a2 
ON a1.machine_id = a2.machine_id
AND a1.process_id = a2.process_id
AND a1.timestamp < a2.timestamp 
GROUP BY a1.machine_id;

#round(n, a) func is used to roundoff of decimal values upto a digits