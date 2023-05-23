# [level 3] 없어진 기록 찾기 - 59042 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/59042) 

### 성능 요약

메모리: 0.0 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > 가입하다

### 채점결과

Empty

### 문제 설명

<p><code>ANIMAL_INS</code> 테이블은 동물 보호소에 들어온 동물의 정보를 담은 테이블입니다. <code>ANIMAL_INS</code> 테이블 구조는 다음과 같으며, <code>ANIMAL_ID</code>, <code>ANIMAL_TYPE</code>, <code>DATETIME</code>, <code>INTAKE_CONDITION</code>, <code>NAME</code>, <code>SEX_UPON_INTAKE</code>는 각각 동물의 아이디, 생물 종, 보호 시작일, 보호 시작 시 상태, 이름, 성별 및 중성화 여부를 나타냅니다.</p>
<table class="table">
        <thead><tr>
<th><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">이름</font></font></th>
<th><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">유형</font></font></th>
<th><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">널 입력 가능</font></font></th>
</tr>
</thead>
        <tbody><tr>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">ANIMAL_ID</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">VARCHAR(N)</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">거짓</font></font></td>
</tr>
<tr>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">동물_유형</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">VARCHAR(N)</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">거짓</font></font></td>
</tr>
<tr>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">날짜 시간</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">날짜 시간</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">거짓</font></font></td>
</tr>
<tr>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">INTAKE_CONDITION</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">VARCHAR(N)</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">거짓</font></font></td>
</tr>
<tr>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">이름</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">VARCHAR(N)</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">진실</font></font></td>
</tr>
<tr>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">SEX_UPON_INTAKE</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">VARCHAR(N)</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">거짓</font></font></td>
</tr>
</tbody>
      </table>
<p><code>ANIMAL_OUTS</code> 테이블은 동물 보호소에서 입양 보낸 동물의 정보를 담은 테이블입니다. <code>ANIMAL_OUTS</code> 테이블 구조는 다음과 같으며, <code>ANIMAL_ID</code>, <code>ANIMAL_TYPE</code>, <code>DATETIME</code>, <code>NAME</code>, <code>SEX_UPON_OUTCOME</code>는 각각 동물의 아이디, 생물 종, 입양일, 이름, 성별 및 중성화 여부를 나타냅니다. <code>ANIMAL_OUTS</code> 테이블의 <code>ANIMAL_ID</code>는 <code>ANIMAL_INS</code>의 <code>ANIMAL_ID</code>의 외래 키입니다.</p>
<table class="table">
        <thead><tr>
<th><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">이름</font></font></th>
<th><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">유형</font></font></th>
<th><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">널 입력 가능</font></font></th>
</tr>
</thead>
        <tbody><tr>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">ANIMAL_ID</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">VARCHAR(N)</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">거짓</font></font></td>
</tr>
<tr>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">동물_유형</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">VARCHAR(N)</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">거짓</font></font></td>
</tr>
<tr>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">날짜 시간</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">날짜 시간</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">거짓</font></font></td>
</tr>
<tr>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">이름</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">VARCHAR(N)</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">진실</font></font></td>
</tr>
<tr>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">SEX_UPON_OUTCOME</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">VARCHAR(N)</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">거짓</font></font></td>
</tr>
</tbody>
      </table>
<p>천재지변으로 인해 일부 데이터가 유실되었습니다. 입양을 간 기록은 있는데, 보호소에 들어온 기록이 없는 동물의 ID와 이름을 ID 순으로 조회하는 SQL문을 작성해주세요. </p>

<h5>예시</h5>

<p>예를 들어, <code>ANIMAL_INS</code> 테이블과 <code>ANIMAL_OUTS</code> 테이블이 다음과 같다면</p>

<p><code>ANIMAL_INS</code></p>
<table class="table">
        <thead><tr>
<th><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">ANIMAL_ID</font></font></th>
<th><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">동물_유형</font></font></th>
<th><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">날짜 시간</font></font></th>
<th><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">INTAKE_CONDITION</font></font></th>
<th><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">이름</font></font></th>
<th><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">SEX_UPON_INTAKE</font></font></th>
</tr>
</thead>
        <tbody><tr>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">A352713</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">고양이</font></font></td>
<td>2017-04-13 16:29:00</td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">정상</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">가족</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">중성화 여성</font></font></td>
</tr>
<tr>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">A350375</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">고양이</font></font></td>
<td>2017-03-06 15:01:00</td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">정상</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">내 거</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">중성화된 수컷</font></font></td>
</tr>
</tbody>
      </table>
<p><code>ANIMAL_OUTS</code></p>
<table class="table">
        <thead><tr>
<th><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">ANIMAL_ID</font></font></th>
<th><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">동물_유형</font></font></th>
<th><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">날짜 시간</font></font></th>
<th><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">이름</font></font></th>
<th><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">SEX_UPON_OUTCOME</font></font></th>
</tr>
</thead>
        <tbody><tr>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">A349733</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">개</font></font></td>
<td>2017-09-27 19:09:00</td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">앨리</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">중성화 여성</font></font></td>
</tr>
<tr>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">A352713</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">고양이</font></font></td>
<td>2017-04-25 12:25:00</td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">가족</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">중성화 여성</font></font></td>
</tr>
<tr>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">A349990</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">고양이</font></font></td>
<td>2018-02-02 14:18:00</td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">기미</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">중성화 여성</font></font></td>
</tr>
</tbody>
      </table>
<p><code>ANIMAL_OUTS</code> 테이블에서</p>

<ul>
<li>Allie의 ID는 <code>ANIMAL_INS</code>에 없으므로, Allie의 데이터는 유실되었습니다.</li>
<li>Gia의 ID는 <code>ANIMAL_INS</code>에 있으므로, Gia의 데이터는 유실되지 않았습니다.</li>
<li>Spice의 ID는 <code>ANIMAL_INS</code>에 없으므로, Spice의 데이터는 유실되었습니다.</li>
</ul>

<p>따라서 SQL문을 실행하면 다음과 같이 나와야 합니다. </p>
<table class="table">
        <thead><tr>
<th><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">ANIMAL_ID</font></font></th>
<th><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">이름</font></font></th>
</tr>
</thead>
        <tbody><tr>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">A349733</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">앨리</font></font></td>
</tr>
<tr>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">A349990</font></font></td>
<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">기미</font></font></td>
</tr>
</tbody>
      </table>
<hr>

<p>본 문제는 <a href="https://www.kaggle.com/aaronschlegel/austin-animal-center-shelter-intakes-and-outcomes" target="_blank" rel="noopener">Kaggle의 "Austin Animal Center Shelter Intakes and Outcomes"</a>에서 제공하는 데이터를 사용하였으며 <a href="https://opendatacommons.org/licenses/odbl/1.0/" target="_blank" rel="noopener">ODbL</a>의 적용을 받습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges