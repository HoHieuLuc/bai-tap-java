# Bài 1. Hãy cho ví dụ sự cần thiết phải tạo sự thừa kế?
- Tránh lặp lại code, lớp con có thể kế thừa thuộc tính và phương thức từ lớp cha:
+ Lớp MayTinh có: gia, cpu, gpu,...
+ Lớp Laptop kế thừa lớp MayTinh, có thêm thuộc tính hang, manHinh, pin,... cùng với phương thức bật máy, tắt máy,...

# Bài 2. Hãy cho ví dụ về sự cần thiết phải tái định nghĩa một phương thức?
- phương thức in thông tin máy, laptop phải in thêm hãng, màn hình, pin,...

# Bài 3. Hãy cho ví dụ về sự cần thiết phải nạp chồng một phương thức?
- phương thức khởi tạo khách hàng với id tăng tự động và phương thức khởi tạo khách hàng với id tùy chọn

# Bài 4. Hãy cho ví dụ sự cần thiết phải ngăn cấm không cho tái định nghĩa một phương thức?
- phương thức bán máy tính chỉ chấp nhận thanh toán bằng thẻ ngân hàng abcxyzBank