# LIFO(Last in First Out)
class Solution(object):
    def isValid(self, s):
        stack = []
        for p in s:
            if p == "(":
                stack.append(")")
            elif p == "{":
                stack.append("}")    
            elif p == "[":
                stack.append("]")
            elif not stack or stack.pop() != p: #닫는 괄호를 만났을때
                return False
        # stack 이 비어있으면(괄호가 짝이 맞다) -> true
        return not stack        