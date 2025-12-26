import ExcelJS from 'exceljs';

console.log('Starting Excel generation...');

async function generate() {
    try {
        const workbook = new ExcelJS.Workbook();
        const worksheet = workbook.addWorksheet('Users');

        // Add Header Row
        worksheet.columns = [
            { header: 'User ID', key: 'username', width: 15 },
            { header: 'User Name', key: 'name', width: 20 },
            { header: 'Email', key: 'email', width: 30 },
            { header: 'Password', key: 'password', width: 15 },
            { header: 'Phone Number', key: 'phone', width: 15 }
        ];

        // Add 10 Sample Users
        const users = Array.from({ length: 10 }, (_, i) => ({
            username: `user${i + 1}`,
            name: `Test User ${i + 1}`,
            email: `user${i + 1}@example.com`,
            password: 'password123!',
            phone: `010-1234-567${i}`
        }));

        worksheet.addRows(users);

        // Style Header
        worksheet.getRow(1).font = { bold: true };

        // Save File
        await workbook.xlsx.writeFile('user_import_sample.xlsx');
        console.log('Sample Excel file created successfully: user_import_sample.xlsx');
    } catch (error) {
        console.error('Error creating Excel file:', error);
        process.exit(1);
    }
}

generate();
