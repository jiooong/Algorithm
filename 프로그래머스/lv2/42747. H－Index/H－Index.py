def solution(citations):

    n = len(citations)
    citations.sort(reverse=True)
    
    for i, citation in enumerate(citations):
        if i >= citation:
            citation = 1
            return i
    return len(citations)