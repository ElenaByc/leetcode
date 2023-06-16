# Write your MySQL query statement below
SELECT st.student_id, st.student_name, su.subject_name, COUNT(e.subject_name) as attended_exams
FROM Students as st
JOIN Subjects as su
LEFT JOIN Examinations as e
ON st.student_id=e.student_id AND su.subject_name=e.subject_name
GROUP BY st.student_id, su.subject_name
ORDER BY student_id, subject_name; 