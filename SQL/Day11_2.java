/*
    다음은 어느 자동차 대여 회사의 자동차 대여 기록 정보를 담은
    CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블입니다.
    CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블은 아래와 같은 구조로 되어있으며,
    HISTORY_ID, CAR_ID, START_DATE, END_DATE 는 각각
    자동차 대여 기록 ID, 자동차 ID, 대여 시작일, 대여 종료일을 나타냅니다.

    Column name	Type	Nullable
    HISTORY_ID	INTEGER	FALSE
    CAR_ID	INTEGER	FALSE
    START_DATE	DATE	FALSE
    END_DATE	DATE	FALSE

    CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블에서
    2022년 10월 16일에 대여 중인 자동차인 경우 '대여중' 이라고 표시하고,
    대여 중이지 않은 자동차인 경우 '대여 가능'을 표시하는 컬럼(컬럼명: AVAILABILITY)을 추가하여
    자동차 ID와 AVAILABILITY 리스트를 출력하는 SQL 문을 작성해주세요.
    이때 반납 날짜가 2022년 10월 16일인 경우에도 '대여중'으로 표시해주시고
    결과는 자동차 ID를 기준으로 내림차순 정렬해주세요.
*/

/*
    SELECT
        EXTRACT(MONTH FROM A.START_DATE) AS MONTH,
        A.CAR_ID,
        COUNT(A.CAR_ID) AS RECORDS
      FROM
        CAR_RENTAL_COMPANY_RENTAL_HISTORY A,
        (SELECT
            CAR_ID
         FROM
            CAR_RENTAL_COMPANY_RENTAL_HISTORY C
         WHERE
            START_DATE >= TO_DATE('2022-08-01', 'YYYY-MM-DD')
            AND START_DATE <= LAST_DAY(TO_DATE('2022-10-01','YYYY-MM-DD'))
         GROUP BY
            CAR_ID HAVING COUNT(CAR_ID) > 4) B
     WHERE A.CAR_ID = B.CAR_ID
       AND A.START_DATE >= TO_DATE('2022-08-01', 'YYYY-MM-DD')
       AND A.START_DATE <= LAST_DAY(TO_DATE('2022-10-01','YYYY-MM-DD'))
     GROUP BY EXTRACT(MONTH FROM A.START_DATE), A.CAR_ID
     ORDER BY MONTH, CAR_ID DESC
*/