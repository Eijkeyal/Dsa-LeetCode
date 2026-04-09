class Solution:
    """using python"""
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        result = []
        #loop through all people
        for _ in range(len(heights)):
            max_height = max(heights)#find tallest heights
            index = heights.index(max_height)#get index of tallest

            result.append(names[index])#add corresponding names
            heights.pop(index)#remove used height
            names.pop(index)#remove used name
        return result