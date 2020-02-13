
from LinkedList import LinkedList



list = LinkedList()
list.insert_at_end(10)
list.insert_at_end(20)
list.insert_at_end(30)
list.insert_at_start(1)
list.insert_at_start(2)
list.remove_at_start()
list.remove_at_end()
print(list.contains(10))
print(list.contains(40))
print(list.indexOf(10))
print(list.get_size())
print(list.toArray())
print(list.getKthFromTheEnd(3))