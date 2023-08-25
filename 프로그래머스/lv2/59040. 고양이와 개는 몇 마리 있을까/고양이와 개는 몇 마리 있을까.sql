SELECT ANIMAL_TYPE, count(*) AS count
FROM ANIMAL_INS
group by ANIMAL_TYPE
order by animal_type