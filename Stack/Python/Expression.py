from Stack import Stack

class Expression:

    left_brackets = ['(','<','[','{']
    right_brackets = [')','>', ']', '}']

    @classmethod
    def is_left_bracket(cls, value):
        return cls.left_brackets.count(value) == 1

    @classmethod
    def is_right_bracket(cls, value):
        return cls.right_brackets.count(value) == 1


    @classmethod
    def is_bracket_match(cls, right, left):
        return cls.is_left_bracket(left) == cls.is_right_bracket(right)

    @classmethod
    def is_balanced(cls,value):
        stack = Stack()
        for item in value:
            if item in cls.left_brackets:
                stack.push(item)

            if item in cls.right_brackets:
                if stack.isEmpty():
                    return False
                top = stack.pop()
                if not cls.is_bracket_match(item, top):
                    return False
        return stack.isEmpty()
