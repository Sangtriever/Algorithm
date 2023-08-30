SELECT  PT_NAME,PT_NO, GEND_CD, AGE, NVL(tlno,'NONE') TLNO
FROM PATIENT
WHERE AGE <= 12 and gend_cd = 'W'
ORDER BY AGE desc, PT_NAME 