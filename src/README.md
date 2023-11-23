# Book_code

The time complexity of the createIndex method largely depends on the number of pages in the book (n) and the average length of the page content (m)

Iterating over the list of keywords: This operation takes O(k), where k is the number of keywords.

For each keyword, there is a stream operation on the list of pages:

Filtering pages based on whether the page content contains the keyword. This operation takes O(n * m) in the worst case, where n is the number of pages, and m is the average length of the page content.
Mapping the filtered pages to their page numbers. This operation takes O(n) since it iterates over all pages.
Collecting the page numbers into a list: This operation takes O(n) in the worst case.

Putting the keyword and its associated list of page numbers into the index map: This operation takes O(1) on average, but in the worst case (due to hash collisions), it could be O(n) for each keyword.

Given these considerations, the overall time complexity of the createIndex method can be expressed as O(k * n * m). If the number of keywords, number of pages, and average page content length are relatively small and constant, the method's time complexity can be considered approximately O(1). 