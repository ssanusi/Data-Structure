class Node:
    def __init__(self, value):
        self.value = value
        self.next = None


class LinkedList:
    def __init__(self):
        self.first_node = None
        self.last_node = None
        self.size = 0

    def insert_at_start(self, item):
        new_node = Node(item)
        if(self.first_node == None):
            self.first = new_node
            self.last = new_node
        else:
            new_node.next = self.first_node
            self.first_node = new_node
        self.size += 1

    def insert_at_end(self, item):
        new_node = Node(item)
        if self.first_node == None:
            self.first_node = new_node
            self.last_node = new_node
        else:
            self.last_node.next = new_node
            self.last_node = new_node
        self.size += 1

    def remove_at_start(self):
        if self.first_node == None:
            return "List is Empty"
        if self.first_node == self.last_node:
            self.first_node = None
            self.last_node = None
            return
        else:
            new_node = self.first_node.next
            self.first_node.next = None
            self.first_node = new_node
        self.size -= 1

    def get_previous_node(self, node):
        current = self.first_node
        while current is not None:
            if current.next == node:
                return current
            current = current.next
        return None

    def remove_at_end(self):
        if self.first_node == None:
            return "List is Empty"
        if self.first_node == self.last_node:
            self.first_node = None
            self.last_node = None
            return
        else:
            node = self.get_previous_node(self.last_node)
            self.last_node = node
            self.last_node.next = None
        self.size -= 1

    def indexOf(self, item):
        index = 0
        current = self.first_node
        while current is not None:
            if current.value == item:
                return index
            current = current.next
            index += 1
        return None

    def contains(self, item):
        return self.indexOf(item) != None

    def get_size(self):
        return self.size

    def toArray(self):
        array = []
        current = self.first_node
        while current is not None:
            array.append(current.value)
            current = current.next
        return array

    def getKthFromTheEnd(self, k):
        if self.first_node == None:
            return "List is Empty"
        a = self.first_node
        b = self.first_node
        for item in range(0, k-1):
            b = b.next
            if b == None:
                return "Kth value is not available"
        while b is not self.last_node:
            a = a.next
            b = b.next
        return a.next.value
