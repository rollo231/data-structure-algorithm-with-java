# 이진 탐색(Binary Search)

## 1. 정의

**정렬된 정수**의 리스트를 같은 크기의 두 부분 리스트로 나누고 필요한 부분에서만 탐색하도록 제한하여 원하는 원소를 찾는 알고리즘이다. 
리스트의 중간 부분에 찾는 원소가 있는지 확인하고, 없으면 위쪽에 있는지 아래쪽에 있는지 판단하여 맨 앞부터 검색하거나 중간부터 검색한다.

- 입력 : 정렬된 원소 리스트

- 탐색 : 리스트에 원소 위치를 반환, 아니면 null

- 시간 복잡도 : O(logn)

## 2. 단순 탐색 vs 이진 탐색

- 단순 탐색 : O(n)

- 이진 탐색 : O(logn)